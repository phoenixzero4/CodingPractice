package system;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemMethods {

	
	public static void main(String[] args) throws UnknownHostException {
		
		try {
			
		
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		String hostName = host.getHostName();
		
		System.out.println("SYSTEM INFORMATION");
		System.out.println("------------------");
		System.out.println("IP: " + ip + "\n HostName: " + hostName);
		
		System.out.println("\nOS INFORMATION");
		System.out.println("------------------");
		System.out.println("OS Name: " + System.getProperty("os.name"));
		System.out.println("OS Version: " + System.getProperty("os.version"));
		System.out.println("OS Arch: " + System.getProperty("os.arch"));
		
		System.out.println("\nUSER INFORMATION");
		System.out.println("------------------");
		System.out.println("User name: " + System.getProperty("user.name"));
		System.out.println("User dir: " + System.getProperty("user.dir"));
		
		System.out.println("\nJAVA INFORMATION");
		System.out.println("------------------");
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("Java home: " + System.getProperty("java.home"));
		
		Runtime run = Runtime.getRuntime();
		System.out.println("\nRUNTIME INFORMATION");
		System.out.println("------------------");
		System.out.println("Available processors: " + run.availableProcessors());
		System.out.println("Total memory: " + run.totalMemory());
//		System.out.println(run.exec("calc.exe"));
		System.out.println();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			String message = ex.getMessage();
			System.err.println(message);
		}
	}
}
