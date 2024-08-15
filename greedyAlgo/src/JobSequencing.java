import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class JobSequencing implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Job a = (Job) o1;
        Job b = (Job) o2;
        return Float.compare(b.profit, a.profit);
    }

    public static class Job{
        private String jobName;
         private int deadLine;                                                              // class member
        private float profit;

        public Job(String jobName,int deadLine, float profit) {                   //    constructor

            // this keyword refers to current instance itself
            this.jobName = jobName;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("J1", 5, 24));
        jobs.add(new Job("J2", 3, 18));
        jobs.add(new Job("J3", 3, 22));
        jobs.add(new Job("J4", 2, 30));
        jobs.add(new Job("J5", 4, 12));
        jobs.add(new Job("J6", 2, 40));

        ArrayList<Job> bestSequence = greedyJobSequencing(jobs);
        for(int i =bestSequence.size()-1; i>=0; i--){
            System.out.println(bestSequence.get(i).jobName);
        }
    }

    public static ArrayList<Job> greedyJobSequencing(ArrayList<Job> jobs){
        int maxDeadline = 0;
        for(Job job: jobs){
            if(job.deadLine>maxDeadline){
                maxDeadline= job.deadLine;
            }
        }
        ArrayList<Job> bestSequence = new ArrayList<>();

        Comparator  comparator = new JobSequencing();
        Collections.sort(jobs,comparator);

        for(int i= maxDeadline;i>0; i--){
            for(Job j: jobs){
                if(j.deadLine>=i){
                    bestSequence.add(j);
                    jobs.remove(j);
                    break;
                }
            }
        }
        return bestSequence;
    }
}











