package September03;

class Candidate {
    private int minSalary;

    public Candidate(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }
}

class Job {
    private int maxSalary;

    public Job(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }
}

public class JobMatching {
    public static boolean match(Candidate candidate, Job job) {
        // Check if minimum salary and maximum salary are present
        if (candidate == null || job == null) {
            throw new IllegalArgumentException("Candidate or job not provided");
        }

        // Calculate the minimum salary with wiggle room
        double minSalaryWithWiggleRoom = candidate.getMinSalary() * 0.9;

        // Check if the candidate's minimum salary with wiggle room is less than or equal to the job's maximum salary
        return minSalaryWithWiggleRoom <= job.getMaxSalary();
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate(120000);
        Job job = new Job(140000);

        boolean isValidMatch = match(candidate, job);

        if (isValidMatch) {
            System.out.println("Valid match!");
        } else {
            System.out.println("Not a valid match.");
        }
    }
}

