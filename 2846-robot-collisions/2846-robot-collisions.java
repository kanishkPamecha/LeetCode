class Solution {
    class Robot {
        int position;
        int health;
        char direction;
        int index;

        public Robot(int p, int h, char d, int i) {
            this.position = p;
            this.health = h;
            this.direction = d;
            this.index = i;
        }
    }

    class SortByPosition implements Comparator<Robot> {
        public int compare(Robot r1, Robot r2) {
            return Integer.compare(r1.position, r2.position);
        }
    }

    private boolean same(String directions) {
        char first = directions.charAt(0);
        for (int i = 1; i < directions.length(); i++) {
            if (directions.charAt(i) != first) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        // If all robots are moving in the same direction, return the healths as is
        if (same(directions)) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int health : healths) {
                ans.add(health);
            }
            return ans;
        }

        ArrayList<Robot> robots = new ArrayList<>();

        for (int i = 0; i < positions.length; i++) {
            robots.add(new Robot(positions[i], healths[i], directions.charAt(i), i));
        }

        Collections.sort(robots, new SortByPosition());

        // Use a stack to manage robots that might collide
        Deque<Robot> stack = new ArrayDeque<>();
        for (Robot robot : robots) {
            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.direction == 'L') {
                Robot top = stack.pop();
                if (top.health > robot.health) {
                    top.health--;
                    stack.push(top);
                    robot = null;
                    break;
                } else if (top.health < robot.health) {
                    robot.health--;
                } else {
                    robot = null;
                    break;
                }
            }
            if (robot != null) {
                stack.push(robot);
            }
        }

        ArrayList<Robot> survivors = new ArrayList<>(stack);
        Collections.sort(survivors, Comparator.comparingInt(r -> r.index));

        ArrayList<Integer> healthsAfter = new ArrayList<>();
        for (Robot robot : survivors) {
            healthsAfter.add(robot.health);
        }
        return healthsAfter;
    }
}