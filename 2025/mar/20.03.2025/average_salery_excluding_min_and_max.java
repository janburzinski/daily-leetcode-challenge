class Solution {
    public double average(int[] salary) {
        int min_salary = Integer.MAX_VALUE;
        int max_salary = Integer.MIN_VALUE;
        int salary_sum = 0;

        for(int i = 0; i < salary.length; i++) {
            int sal = salary[i];
            
            if(sal <= min_salary) min_salary = sal;
            if(sal >= max_salary) max_salary = sal;

            salary_sum += sal;
        }

        return (salary_sum-min_salary-max_salary)/(salary.length-2);
    }
}