public class Programa{
	public static void main(String[] args){
		int idade = Integer.parseInt(args[0]);
		if (idade == 20 || idade == 30){
				System.out.println("você ganhou um presente");
		}else{
				System.out.println("você não ganhou, precisa ter 20 ou 30 anos");
		}
	}	
	
}