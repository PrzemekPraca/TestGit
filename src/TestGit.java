
public class TestGit {

	public static void main(String[] args) {
		int a=1 ,b=1,suma=0;
		for (int i = 0; i < 10; i++) {
			suma+=(a+i)+(b+i);
		}
		System.out.println(suma);
		/*
		 * komentarz
		 */
		
//<<<<<<< HEAD
		// komentarz 3
		
		//komentarz2
//=======
		//kolejny komentarz
//>>>>>>> FirstBranch
	}
}
