import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	//12279 - Emoogle Balance
	StreamTokenizer stk;
	int readInt() throws Exception { stk.nextToken(); return (int) stk.nval; }
	public static void main(String [] args) throws Exception{
		new Main().run();
	}
	void run() throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		stk = new StreamTokenizer(bfr);
		int N, tc = 1;
		while((N=readInt())!=0){
			int sum = 0;
			for(int i=0;i<N;i++){
				sum += readInt()==0? -1 : 1;
			}
			System.out.println("Case "+(tc++)+": "+sum);
		}
	}
}