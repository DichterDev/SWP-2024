package at.dichter.design_patterns.factory_test;

public class AlgoFactory {
    public Algorithm getAlgo(String os) throws OSNotFoundException {
        if(os == "Windows") return new BillGatesAlgo();
        else if(os == "Apple") return new SteveJobsAlgo();
        else if(os == "Linux") return new LinusTorvaldAlgo();
        throw new OSNotFoundException();
    }
}
