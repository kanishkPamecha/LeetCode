class Solution {
    class Worker {
        int quality;
        int wage;
        double prop;
        public Worker(int quality , int wage){

                this.quality=quality;
                this.wage =wage;
                this.prop = quality/wage;
        }
    }
  public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
    List<Integer> workers = new ArrayList<>();
    for (int i = 0; i < quality.length; ++i) workers.add(i);
    Collections.sort(workers, (a, b) -> Double.compare(wage[a]/(double)quality[a], wage[b]/(double)quality[b]));
    PriorityQueue<Integer> maxQ = new PriorityQueue<>((a, b) -> Integer.compare(quality[b], quality[a]));
    Double result = Double.MAX_VALUE;  
    int qualitySum = 0;   
    for (int currWorker : workers) {
        maxQ.add(currWorker);
        qualitySum += quality[currWorker];
        if (maxQ.size() > K) qualitySum -= quality[maxQ.remove()];  
        if (maxQ.size() == K) result = Math.min(result, qualitySum * (wage[currWorker]/(double)quality[currWorker]));
    }
    return result; 
  }
} 