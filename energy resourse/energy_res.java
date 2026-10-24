//develop a java pgm to create an abstract class energy resourse with members
//source id , source name and energy generated in KW
//include an abstract method calculate efficiency derive the classes solar energy and wind energy from energy sorce and
//implement the method based on 
// following criteria for solar energy efficiency is calculated as energy generated divided by 5000 wholde multiplied by 100
//display source detail and efficiency percentage

abstract class energy{
    int src_id;
    String src_name;
    double energy_gen;
    abstract double cal_eff();
    energy(int src_id, String src_name , double energy_gen){
        this.src_id = src_id;
        this.src_name = src_name;
        this.energy_gen = energy_gen;

    }
    void display_details(){
        System.out.println("Energy id:"+src_id);
        System.out.println("Source Name: " + src_name);
        System.out.println("Energy Generated: " + energy_gen + " KW");
        System.out.println("Efficiency: " + cal_eff() + "%");
        System.out.println();
    }
}


class solar_energy extends energy{
    solar_energy(int src_id , String src_name , double energy_gen){
        super(src_id,src_name,energy_gen);
    }
    double cal_eff(){
         return (energy_gen / 5000) * 100;
    }
}

class wind_energy extends energy{
    wind_energy(int src_id , String src_name , double energy_gen){
        super(src_id,src_name,energy_gen);
    }
    double cal_eff(){
         return (energy_gen / 8000) * 100;
    }
}

class energy_res {
    public static void main(String args[]) {
        solar_energy s = new solar_energy(101, "Solar Energy", 4000);
        wind_energy w = new wind_energy(102, "Wind Energy", 3000);

        s.display_details();
        w.display_details();
    }
}