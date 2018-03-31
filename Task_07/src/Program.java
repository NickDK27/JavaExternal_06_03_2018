
import java.net.InterfaceAddress;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws java.io.IOException {
        int n = 15;
        Vehicle[] mas = new Vehicle[n];
        AbstractVehicleFactory vf = new VehicleFactory();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = vf.RandVehicle();
        }

        int number;
        int number_root = 1;
        Scanner scan = new Scanner(System.in);

        while (number_root != 0) {
            System.out.println("1 - Вивести на екран координати транспортного засобу");
            System.out.println("2 - Вивести на екран ціну транспортного засобу");
            System.out.println("3 - Вивести на екран швидкість транспортного засобу");
            System.out.println("4 - Вивести на екран рік випуску транспортного засобу");
            System.out.println("5 - Задати координати транспортного засобу");
            System.out.println("6 - Задати ціну транспортного засобу");
            System.out.println("7 - Задати швидкість транспортного засобу");
            System.out.println("8 - Задати рік випуску транспортного засобу");
            System.out.println("9 - Вивести на екран координати всіх транспортних засобів");
            System.out.println("10 - Вивести на екран додаткові поля для літака");
            System.out.println("11 - Вивести на екран додаткові поля для корабля");
            System.out.println("12 - Задати додаткові поля для літака");
            System.out.println("13 - Задати додаткові поля для корабля");
            System.out.println("14 - Знайти найдорожчий транспортний засіб");
            System.out.println("15 - Знайти транспортний засіб: рік випуску 2000-2005, швидкість більше 150 км/год, найменша вартість");
            System.out.println("16 - Масив Car не старше 5 років");
            System.out.println("17 - Масив Ship не старше 5 років з відсортованою ціною за спаданням");
            System.out.println("18 - Три послідовності IFly, ISwim, IMove");
            System.out.println("19 - min та max");
            System.out.println("0 - Вихід");

            number_root = scan.nextInt();

            switch (number_root) {
                case 1:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_coord();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 2:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_price();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 3:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_speed();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_year();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 5:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть географічну широту транспортного засобу");
                    double x = scan.nextDouble();
                    System.out.println("\nВведіть географічну довготу транспортного засобу");
                    double y = scan.nextDouble();
                    mas[number].setLatitude(x);
                    mas[number].setLongitude(y);
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 6:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть ціну транспортного засобу");
                    mas[number].setPrice(scan.nextDouble());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 7:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть швидкість транспортного засобу");
                    mas[number].setSpeed(scan.nextDouble());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 8:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть рік випуску транспортного засобу");
                    mas[number].setYear(scan.nextInt());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 9:
                    for (int i = 0; i < mas.length; i++)
                        mas[i].display_coord();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 10:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Plane))
                        System.out.println("\nЦе не літак!");
                    else {
                        double h = ((Plane)mas[number]).getHeight();
                        int k = ((Plane)mas[number]).getPassengers();
                        System.out.printf("Висота: %.3f\n", h);
                        System.out.printf("Кількість пасажирів: %d\n", k);
                        System.out.println("Press Enter");
                        System.in.read();
                    }
                    break;
                case 11:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Ship))
                        System.out.println("\nЦе не корабель!");
                    else {
                        String str = ((Ship)mas[number]).getPort();
                        int k = ((Ship)mas[number]).getPassengers();
                        System.out.printf("Кількість пасажирів: %d\n", k);
                        System.out.printf("Порт: ", str, "\n");
                        System.out.println("Press Enter");
                        System.in.read();
                    }
                    break;
                case 12:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Plane))
                        System.out.println("\nЦе не літак!");
                    else {
                        System.out.println("\nВведіть висоту");
                        ((Plane)mas[number]).setHeight(scan.nextDouble());
                        System.out.println("\nВведіть кількість пасажирів");
                        ((Plane)mas[number]).setHeight(scan.nextInt());
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 13:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Ship))
                        System.out.println("\nЦе не корабель!");
                    else {
                        System.out.println("\nВведіть порт");
                        ((Ship)mas[number]).setPort(scan.next());
                        System.out.println("\nВведіть кількість пасажирів");
                        ((Ship)mas[number]).setPassengers(scan.nextInt());
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 14:
                    for (int i = 0; i < mas.length; i++)
                        mas[i].display_price();
                    System.out.println("\nТранспортний засіб з найвищою ціною");
                    Max_Price(mas).display_price();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 15:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nТранспортний засіб: рік випуску 2000-2005, швидкість більше 150 км/год, найменша вартість");
                    Vehicle temp = Universal(mas);
                    if (temp == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        temp.display_price();
                        temp.display_year();
                        temp.display_speed();
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 16:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nМасив Car не старше 5 років");
                    Car[] temp_car = Get_Car(mas);
                    if (temp_car == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        for (int i = 0; i < temp_car.length; i++) {
                            temp_car[i].display_price();
                            temp_car[i].display_year();
                            temp_car[i].display_speed();
                        }
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 17:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nВідсортований масив Ship не старше 5 років");
                    Ship[] temp_ship = Get_Ship(mas);
                    if (temp_ship == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        for (int i = 0; i < temp_ship.length; i++) {
                            temp_ship[i].display_price();
                            temp_ship[i].display_year();
                            temp_ship[i].display_speed();
                        }
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 18:
                    System.out.println("\nIFly");
                    display(mas, IFly.class);
                    mas = SortI(mas, IFly.class);
                    System.out.println("Відсортована IFly");
                    display(mas, IFly.class);

                    System.out.println("ISwim");
                    display(mas, ISwim.class);
                    mas = SortI(mas, ISwim.class);
                    System.out.println("Відсортована ISwim");
                    display(mas, ISwim.class);

                    System.out.println("IMove");
                    display(mas, IMove.class);
                    mas = SortI(mas, IMove.class);
                    System.out.println("Відсортована IMove");
                    display(mas, IMove.class);

                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 19:
                    System.out.println("\nМінімальна швидкість серед IFly");
                    display(MinI(mas, IFly.class), IFly.class);
                    System.out.println("\nМаксимальна швидкість серед IFly");
                    display(MaxI(mas, IFly.class), IFly.class);

                    System.out.println("\nМінімальна швидкість серед ISwim");
                    display(MinI(mas, ISwim.class), ISwim.class);
                    System.out.println("\nМаксимальна швидкість серед ISwim");
                    display(MaxI(mas, ISwim.class), ISwim.class);

                    System.out.println("\nМінімальна швидкість серед IMove");
                    display(MinI(mas, IMove.class), IMove.class);
                    System.out.println("\nМаксимальна швидкість серед IMove");
                    display(MaxI(mas, IMove.class), IMove.class);

                    System.out.println("Press Enter");
                    System.in.read();
                    break;

                    default:
                        break;
            }
        }
    }


    public static Vehicle Max_Price(Vehicle[] mas){
        int imax = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].getPrice() > mas[imax].getPrice())
                imax = i;
        }
        return mas[imax];
    }

    public static Vehicle Universal(Vehicle[] mas){
        int imin = 0;
        Boolean fl = false;
        if (mas[imin].getYear() > 1999 && mas[imin].getYear() < 2006 && mas[imin].getSpeed() > 150)
            fl = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].getYear() > 1999 && mas[i].getYear() < 2006 && mas[i].getSpeed() > 150 && mas[i].getPrice() < mas[imin].getPrice()) {
                imin = i;
                fl = true;
            }
        }
        if (fl)
            return mas[imin];
        else
            return null;
    }

    public static Car[] Get_Car(Vehicle[] mas){
        int k = 0;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] instanceof Car && mas[i].getYear() > 2013)
                k++;

        if (k == 0)
            return null;
        else {
            Car[] temp = new Car[k];
            k = 0;
            for (int i = 0; i < mas.length; i++)
                if (mas[i] instanceof Car && mas[i].getYear() > 2013) {
                    temp[k] = (Car)mas[i];
                    k++;
                }
            return temp;
        }
    }


    public static Ship[] Get_Ship(Vehicle[] mas){
        int k = 0;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] instanceof Ship && mas[i].getYear() > 2013)
                k++;

        if (k == 0)
            return null;
        else {
            Ship[] temp = new Ship[k];
            k = 0;
            for (int i = 0; i < mas.length; i++)
                if (mas[i] instanceof Ship && mas[i].getYear() > 2013) {
                    temp[k] = (Ship)mas[i];
                    k++;
                }

            return Sort(temp);
        }
    }

    public static Ship[] Sort(Ship[] vector)
    {
        int imin;
        Ship temp;
        for(int i = 0; i < vector.length - 1; i++)
        {
            imin = i;
            for (int j = i + 1; j < vector.length; j++)
            {
                if (vector[j].getPrice() > vector[imin].getPrice())
                    imin = j;
            }

            temp = vector[imin];
            vector[imin] = vector[i];
            vector[i] = temp;
        }

        return vector;
    }

    public static Vehicle[] SortI(Vehicle[] vector, Class inter)
    {
        int imin;
        Vehicle temp;
        double speed_j, speed_min;
        for(int i = 0; i < vector.length - 1; i++)
        {
            while ( (i < vector.length - 1) && ( (IMove.class.equals(inter) && (!(vector[i] instanceof IMove))) ||
                    (ISwim.class.equals(inter) && (!(vector[i] instanceof ISwim))) ||
                    (IFly.class.equals(inter) && (!(vector[i] instanceof IFly))) ))
                i++;

            imin = i;
            speed_min = speed_value(vector[imin], inter);

            for (int j = i + 1; j < vector.length; j++)
            {
                while ( (j < vector.length - 1) && ( (IMove.class.equals(inter) && (!(vector[j] instanceof IMove))) ||
                        (ISwim.class.equals(inter) && (!(vector[j] instanceof ISwim))) ||
                        (IFly.class.equals(inter) && (!(vector[j] instanceof IFly))) ))
                    j++;

                if ((j < vector.length) && (vector[j] instanceof Amphibia)) {
                    if (((Amphibia)vector[j]).getSpeed(inter) > speed_min) {
                        speed_min = speed_value(vector[j], inter);
                        imin = j;
                    }
                }
                else if ((j < vector.length) && (vector[j] instanceof BatMobile)) {
                    if (((BatMobile)vector[j]).getSpeed(inter) > speed_min){
                        speed_min = speed_value(vector[j], inter);
                        imin = j;
                    }
                }
                else if ((j < vector.length) && (vector[j].getSpeed() > speed_min)){
                    speed_min = speed_value(vector[j], inter);
                    imin = j;
                }
            }

            temp = vector[imin];
            vector[imin] = vector[i];
            vector[i] = temp;
        }

        return vector;
    }

    public static Vehicle MinI(Vehicle[] vector, Class inter)
    {
        int i = 0;
        while ((i < vector.length) && ((IMove.class.equals(inter) && (!(vector[i] instanceof IMove))) ||
                (ISwim.class.equals(inter) && (!(vector[i] instanceof ISwim))) ||
                (IFly.class.equals(inter) && (!(vector[i] instanceof IFly)))))
            i++;

        int imin = i;
        double speed_min = speed_value(vector[imin], inter);;

        for(; i < vector.length; i++) {
            while ((i < vector.length) && ((IMove.class.equals(inter) && (!(vector[i] instanceof IMove))) ||
                    (ISwim.class.equals(inter) && (!(vector[i] instanceof ISwim))) ||
                    (IFly.class.equals(inter) && (!(vector[i] instanceof IFly)))))
                i++;

            if (i < vector.length)
                if (vector[i] instanceof Amphibia) {
                    if (((Amphibia) vector[i]).getSpeed(inter) < speed_min) {
                        speed_min = speed_value(vector[i], inter);
                        imin = i;
                    }
                } else if (vector[i] instanceof BatMobile) {
                    if (((BatMobile) vector[i]).getSpeed(inter) < speed_min) {
                        speed_min = speed_value(vector[i], inter);
                        imin = i;
                    }
                } else if (vector[i].getSpeed() < speed_min) {
                    speed_min = speed_value(vector[i], inter);
                    imin = i;
                }
        }

        return vector[imin];
    }

    public static Vehicle MaxI(Vehicle[] vector, Class inter)
    {
        int i = 0;
        while ((i < vector.length) && ((IMove.class.equals(inter) && (!(vector[i] instanceof IMove))) ||
                (ISwim.class.equals(inter) && (!(vector[i] instanceof ISwim))) ||
                (IFly.class.equals(inter) && (!(vector[i] instanceof IFly)))))
            i++;

        int imax = i;
        double speed_max = speed_value(vector[imax], inter);;

        for(; i < vector.length; i++) {
            while ((i < vector.length) && ((IMove.class.equals(inter) && (!(vector[i] instanceof IMove))) ||
                    (ISwim.class.equals(inter) && (!(vector[i] instanceof ISwim))) ||
                    (IFly.class.equals(inter) && (!(vector[i] instanceof IFly)))))
                i++;

            if (i < vector.length)
                if (vector[i] instanceof Amphibia) {
                    if (((Amphibia) vector[i]).getSpeed(inter) > speed_max) {
                        speed_max = speed_value(vector[i], inter);
                        imax = i;
                    }
                } else if (vector[i] instanceof BatMobile) {
                    if (((BatMobile) vector[i]).getSpeed(inter) > speed_max) {
                        speed_max = speed_value(vector[i], inter);
                        imax = i;
                    }
                } else if (vector[i].getSpeed() > speed_max) {
                    speed_max = speed_value(vector[i], inter);
                    imax = i;
                }
        }

        return vector[imax];
    }

    public static double speed_value(Vehicle element, Class inter){
        double speed_imin;
        if (element instanceof Amphibia)
            speed_imin = ((Amphibia)element).getSpeed(inter);
        else if (element instanceof BatMobile)
            speed_imin = ((BatMobile)element).getSpeed(inter);
        else
            speed_imin = element.getSpeed();
        return speed_imin;
    }

    public static void display(Vehicle[] vector, Class inter){
        for (int i = 0; i < vector.length; i++)
            if (IMove.class.equals(inter) && (vector[i] instanceof IMove)){
                vector[i].display_speed();
            }
            else if (ISwim.class.equals(inter) && (vector[i] instanceof ISwim)){
                vector[i].display_speed();
            }
            else  if (IFly.class.equals(inter) && (vector[i] instanceof IFly)){
                vector[i].display_speed();
            }
        System.out.println("\n");
    }

    public static void display(Vehicle element, Class inter){
        if (IMove.class.equals(inter) && (element instanceof IMove)){
            element.display_speed();
        }
        else if (ISwim.class.equals(inter) && (element instanceof ISwim)){
            element.display_speed();
        }
        else  if (IFly.class.equals(inter) && (element instanceof IFly)){
            element.display_speed();
        }
        System.out.println("\n");
    }
}





