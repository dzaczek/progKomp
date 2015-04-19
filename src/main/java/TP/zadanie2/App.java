package TP.zadanie2;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Library libMan=new Library();
    	
    	String  atitle[]={"Okgniemi Mieczem","Potop","Przedwiosnie","Harrypotter","Strolatsamotności "};
    	String  aauthor[]={"Jan Kochanowski", "Henrtyk Sienkiewicz ","Barbara Głodowska","Dominik K "," Gall Anonim " };
    
    	//libMan.addBook(1,"aaa  aa", "bbb b", "198 4");
   // 	libMan.printAllBooks();
    	
    	for (int i = 0;i<4;i++)
    	{
    		System.out.println(i);
          libMan.addBook(i,atitle[i], aauthor[i],"2015-05-01");
    	}
    	
    	libMan.printAllBooks();
    	
    	System.out.println( "Hello World!" );
    }
}
