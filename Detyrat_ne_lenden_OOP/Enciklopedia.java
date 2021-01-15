public class Enciklopedia extends Book{
	
	private int nrAuthor;
	
	public Enciklopedia(int i, String t, int vP, int nrA){
		super(i, t, vP);
		nrAuthor = nrA;
	}
	
	public int getNrAuthor(){ return nrAuthor;  }
	
	public void setNrAuthor(int nrA){ nrAuthor = nrA; }
	
	public boolean hasHomework(){ return false; }
	
	public String toString(){
		return "Enciklopedia " + super.toString() + " has " + nrAuthor + " authors";
	}

}