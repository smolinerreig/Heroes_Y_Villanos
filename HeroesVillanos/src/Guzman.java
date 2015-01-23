
public class Guzman {
	public static void main(String[]args){
		char base[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char textoCod[]={'e','s','b','d','v','m','b'};
		int k=1;
		
		for(int i=0;i<textoCod.length;i++){//RECORRE TEXTO
			for(int j=0;j<base.length;j++){
				if(textoCod[i]==base[j]){//COMPARA CONTENIDO DE BASE[I] BUSCANDO EL IGUAL EN TEXTOCOD
					if((j-k)<0){//BUSCA SI LA LETRA A CONVERTIR ES LA "A"
						System.out.print(base[base.length-k]);//SI ES "TRUE" LA REEMPLAZA POR LA "Z"
					}else{ 
						System.out.print(base[j-k]);//SI ES "FALSE" LA REEMPLAZA POR LA LETRA ANTERIOR
					}
				}
			}
			
		}
	}
}
