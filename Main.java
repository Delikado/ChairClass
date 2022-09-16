public class Main {
  public static void main(String[] args) {
    Chair mine = new Chair();
    System.out.println(mine);
    mine.changeHeight(50);
    mine.changePosition(180);

    System.out.println();
    
    Chair clark = new Chair(70, 100, "black");
    System.out.println(clark);
    clark.tellHeight();  
    clark.changeColor("blue");

    
    System.out.println();
    
    Chair atem = new Chair("gray");
    System.out.println(atem);
    atem.changePosition(270.5);
  }
}