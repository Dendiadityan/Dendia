/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.pool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class prosesor implements Runnable{
    private int id;
    public prosesor(int i ){
        this.id=id;
        
    }

    @Override
    public void run() {
   try{
       Thread. sleep(1);
       }catch(InterruptedException e){
           e.printStackTrace();
       }
    }
}
        
public class ThreadPool {
public static void main(String[] args) {

    ExecutorService service = Executors.newFixedThreadPool(2);
    int i;
for (i=1; i<=99; i=i+2)
{
System.out.print(i + ". ");

    service.submit(new prosesor(i));
    System.out.println(i);
    
}
 service.shutdown();
 System.out.println("semua task telah disubmit");
 
 try{
     service.awaitTermination(1, TimeUnit.DAYS);
 } catch (InterruptedException e){
     e.printStackTrace();
 }
 System.out.println("semua task telah selesai");
    }
    
}
