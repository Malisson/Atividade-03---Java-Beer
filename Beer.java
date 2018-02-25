import java.util.Scanner;

public class Beer {
public static void main(String[] args) {

int cervejas = 99;
int opcao =0;
int quantidade = 0;
Scanner leitor = new Scanner(System.in);
while(cervejas > 0){
System.out.println(cervejas + " Cevejas no freezer.");
System.out.println("Pego uma garrafa e passo a Frente.");
cervejas = cervejas - 1;
System.out.println("Agora são " + cervejas + " no freezer. \n");
if (cervejas ==1){
System.out.println("Acabaram todas... quer beber mais?");
System.out.println("Digite 1 - para Sim");
System.out.println("Digite 2 - para Não");
opcao = leitor.nextInt();
if(opcao==1){
System.out.println("Informe a quantidade de cervejas");
quantidade = leitor.nextInt();
cervejas = quantidade;
System.out.println("Cervejas reabastecidas");
}
}
}
}
}
