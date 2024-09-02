	import java.util.Scanner;
	class  books{
	    String title,author;
	    int price,no;
	    int count=0;
	    public books(String tit,String aut,int pri,int n){	       
                this.title=tit;
	        this.author=aut;
	        this.price=pri;
	        this.no=n;
	    }
	    public void display(){
	        
	        for(int i=1;i<4;i++){
	            count+=1;
	        System.out.println("Detail of Book "+count);
	        System.out.println("Title: "+title+","+"Author: "+author+","+"Price: "+","+price+","+"No of Copies:"+no);
	        break;
	        }
	    }
	
	}
	
	public class book_store {
	    public static void  main(String args[]){
	        String  tit,aut;
	            int pri,n;
	        Scanner s=new Scanner(System.in);
	        books[] book=new books[3];
	        for(int i=0;i<3;i++){
	            
	            System.out.println("enter the title for book"+ (i+1));
	            tit=s.nextLine();
	            System.out.println("enter the author name of book"+(i+1));
	            aut=s.nextLine();
	            System.out.println("enter the price of the book"+(i+1));
	            pri=s.nextInt();
	            System.out.println("enter the no of copies of book"+(i+1));
	            n=s.nextInt();
	            s.nextLine();
	            book[i]=new books(tit,aut,pri,n);
	
	        }
	        for(books b:book){
	            b.display();
	        }
	    }
	}
	

