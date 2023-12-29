package thread;

public class DownloadFileTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Downloading a file..." + Thread.currentThread().getName());
		
//		try {
//			Thread.sleep((int)Math.floor(Math.random() * 10000));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(var i = 0; i < Integer.MAX_VALUE; i++) {
			if(Thread.currentThread().isInterrupted()) return;
				System.out.println("Downloading byte" + i);
		}
		
		System.out.println("Download complete: " + Thread.currentThread().getName());
	}

}
