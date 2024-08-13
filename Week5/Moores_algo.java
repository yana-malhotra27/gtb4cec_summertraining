package Week5;

public class Moores_algo {
    //Moore's algorithm
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> hash = new HashMap<>();
        // for (int n:nums) {
        //     hash.put(n,hash.getOrDefault(n,0)+1);
        // }
        // int n=nums.length/2;
        // for(Map.Entry<Integer,Integer> m:hash.entrySet()){
        //     if (m.getValue()>n) {
        //         return m.getKey();
        //     }
        // }
        // return -1;
        //MOORE'S ALGORITHM   
        int candidate=0;
        int count=0;
        for(int i:nums){
            if(count==0){
                candidate=i;
            }
            if(i==candidate){
                count++;
            }
            else{
                count--;
            }
        }     
        return candidate;
    }
}
