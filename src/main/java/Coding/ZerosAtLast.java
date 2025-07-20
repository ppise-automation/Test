package Coding;

public class ZerosAtLast {
    public static void main(String[] args) {
        int [] a = {11,0,22,0,33,0,44,0};

        int [] temp = new int[a.length];
        int j = 0;


        for(int h : a){
            if(h != 0){
                temp[j++] = h;
            }
        }

        while(j < a.length){
            temp[j++] = 0;
        }

        for(int s : temp){
            System.out.print(s+" ");
        }
    }
}
