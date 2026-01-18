/*Q4. Use join() method to make one thread wait until another completes. */
class Table extends Thread{
    public void run(){
       
            for(int i=0;i<=5;i++){
                System.out.println("child Thread : "+i);
                 try{
                    Thread.sleep(500);
            
                 }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
}
}
public class Wait_Operation{
    public static void main(String x[]){
            Table t = new Table();
            t.start();
            try{
                t.join();
            }catch(Exception e){
                System.out.println("Error is "+e);
           }

           for(int i=1;i<=5;i++){
            System.out.println("Main Thread : "+i);
           }
    }
}