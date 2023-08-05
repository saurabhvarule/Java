

interface IndianCulture{

	void Festival();

	void LifeStyle();
}

class Maharashtra implements IndianCulture{

	public void Festival(){

		System.out.println("Ganesh Utsav");
	}

	public void  LifeStyle(){

		System.out.println("Saree");
	}
}
class Kerala implements IndianCulture{

	public void Festival(){

		System.out.println("Onam");
	}
	public void LifeStyle(){
		
		System.out.println("Lungi");

	}
}
class India{

	public static void main(String[] args){
		
		Maharashtra m = new Maharashtra();
		m.Festival();
		m.LifeStyle();
		Kerala k = new  Kerala();
		k.Festival();
		k.LifeStyle();


	}
}
