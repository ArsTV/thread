package tast3;

public class DownloadManager extends Thread
{
 public static void main(String[] args)
 {
   Thread thread = new DownloadManager();
   thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
   {
    @Override
    public void uncaughtException(Thread t, Throwable e)
    {

    }
 });

 thread.start();
}
}
