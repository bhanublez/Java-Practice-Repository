import java.util.*;

class FCFS { //implements Comparable<FCFS>{
    private int ar,br,ct,tr,wt;
        
          FCFS(int ar,int br){
            this.ar=ar;
            this.br=br;
        }
        // public  void FCF(int ar,int br){
        //     this.ar=ar;
        //     this.br=br;
        // }
            public int get_ar(){
                return this.ar;
            }
            public int get_tr(){
                return this.tr;
            }
            public int get_wt(){
                return this.wt;
            }
            public int get_ct(){
                return this.ct;
            }
            public int get_br(){
                return this.br;
            }
            public void set_ar(int ar){
                this.ar=ar;
            }
            
            public void set_br(int br){
                this.br=br;
            }
            public void set_ct(int ct){
                this.ct=ct;
            }
            public void set_tr(int tr){
                this.tr=tr;
            }
            public void set_wt(int wt){
                this.wt=wt;
            }
           
            
        // public int compareTo(FCFS o) {
        //     if(this.ar !=o.get_ar()){
        //         return this.ar-o.get_ar();
        //     }
        //    // return this.br.compareTo(o.get_br());
        //     return ar;
        // }

        // public FCFS() {
        // }
        public void Display(){            
            System.out.println(this.ar+" \t\t "+this.br+" \t\t "+this.wt+" \t\t "+this.tr);
        }
    }




public class fcfs_cpu_seduling{
        

    public static void main(String[] args) {
        //fcfs_cpu_seduling fs=new fcfs_cpu_seduling();
        System.out.println("Enter Number of Process");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FCFS pi[]=new FCFS[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Process "+(int)(i+1)+" Arriving time and Brute Timing");
           // pi[i]=new FCFS(sc.nextInt(),sc.nextInt());
           pi[i]= new FCFS(sc.nextInt(), sc.nextInt());
        }

        //Sorting of AR
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(pi[i].get_ar()>pi[j].get_ar()){
                    FCFS temp=pi[i];
                    pi[i]=pi[j];
                    pi[j]=temp;
                }
            }
        }

        //Displaying sorted array
        

        
       // Arrays.sort(pi,(first,second)->(first.get_ar() !=second.get_ar())?(first.get_ar()-second.get_ar()):(first.get_br().compareTo(second.get_br())));
        
       double avgwt=0,avgtr=0;
       //Calculating Completion time
       for(int i=0;i<n;i++){
        if(i==0){
            pi[i].set_ct(pi[i].get_ar()+pi[i].get_br());
        }else{
            if(pi[i].get_ar()>pi[i-1].get_ct()){
                pi[i].set_ct(pi[i].get_ar()+pi[i].get_br());
            }else{
                
                pi[i].set_ct(pi[i].get_br()+pi[i-1].get_ct());
            }
        }
        pi[i].set_tr(pi[i].get_ct()-pi[i].get_ar());
        pi[i].set_wt(pi[i].get_tr()-pi[i].get_br());
        avgwt+=pi[i].get_wt();
        avgtr+=pi[i].get_tr();
       }

       for(FCFS i:pi){
        System.out.println("Arrival_Time \t Brute_time \t Waiting_time \t Turnaround_time");
        i.Display();
    }
    System.out.println("Average Waiting time is "+avgwt/n);
    System.out.println("Average Turnaround time is "+avgtr/n);
    

       


    }
    
    
}