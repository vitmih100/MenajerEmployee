package menajeremployee;

import enums.EBACK_END;
import enums.EFRONT_END;
import enums.EMenu;
import java.util.Scanner;

class meniulPrincipal{

  private EMenu Menu;
  private EFRONT_END FRONT_END;
  private EBACK_END BACK_END;

  public meniulPrincipal(){
    this.Menu = EMenu.Main_menu;
    this.FRONT_END = EFRONT_END.MENIUL;
    this.BACK_END = EBACK_END.End_execution;
  }

  public EMenu getMenu(){
    return this.Menu;
  }

  public EFRONT_END getFRONT_END(){
    return this.FRONT_END;
  }

  public EBACK_END getBACK_END(){
    return this.BACK_END;
  }

  public void setMenu(EMenu Menu){
    this.Menu=Menu;
  }

  public void setFRONT_END(EFRONT_END FRONT_END){
    this.FRONT_END=FRONT_END;
  }

  public void setBACK_END(EBACK_END BACK_END){
    this.BACK_END=BACK_END;
  }


  private void main_meniu(){
    setMenu(EMenu.Main_menu);
    MenajerEmployee.clrscr();
    System.out.println("\n\n\n\t\t  **** MENIU ****");
    System.out.println("\t  1. Insert Employee ");
    System.out.println("\t  2. Edit Employee ");
    System.out.println("\t  3. Show Employee ");
    System.out.println("\t  q. Exit ");

    Scanner in = new Scanner(System.in);
    switch((int)in.next().charAt(0)){
      case 49:{this.BACK_END=EBACK_END.InsertEmployee; break;}
      case 50:{this.BACK_END=EBACK_END.EditEmployee; break;}
      case 51:{this.BACK_END=EBACK_END.ShowEmployee; break;}
      case 113:{this.BACK_END=EBACK_END.End_execution; break;}
    }
  }

  private void meniulEditEmployee(){
    setMenu(EMenu.Edit_menu_employee);
    MenajerEmployee.clrscr();
    System.out.println("\n\n\n\t***MENIU EDIT EMPLOYEE");
    System.out.println("\t 1. Edit nume");
    System.out.println("\t 2. Edit salariu");
    System.out.println("\t 3. Edit data angajarii");
    System.out.println("\t 4. Edit date nasterii");
    System.out.println("\t 5. Edit genul");
    System.out.println("\t q. Exit");
    Scanner in = new Scanner(System.in);
    switch((int)in.next().charAt(0)){
      case 49: {this.BACK_END=EBACK_END.EditNume;} break;
      case 50: {this.BACK_END=EBACK_END.EditSalariu;} break;
      case 51: {this.BACK_END=EBACK_END.EditDataAngaj;} break;
      case 52: {this.BACK_END=EBACK_END.EditDataNast;} break;
      case 53: {this.BACK_END=EBACK_END.EditGenul;} break;
      case 113: {this.BACK_END=EBACK_END.EditEmployee;} break;
    }
}


  public void meniul(){
    switch(getMenu()){
      case Main_menu: main_meniu(); break;
      case Edit_menu_employee: meniulEditEmployee(); break;
    }
  }
}
