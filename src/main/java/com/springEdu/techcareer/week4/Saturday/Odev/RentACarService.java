package com.springEdu.techcareer.week4.Saturday.Odev;

import java.util.ArrayList;
import java.util.List;

public class RentACarService {

    static List<Car> carList;

    private Customer customer;

    public RentACarService(Customer customer) {
        this();                      // parametresiz constructor
        this.customer = customer;

    }

    public RentACarService() {
        createCarRepo();
    }

    //Bireysel müşteri sadece Hatchback araçları görsün.
    public List<Car> getCarList() {
        List<Car> carsListForCustomerType = new ArrayList<>();
        for (Car car : carList) {
            if (customer instanceof IndividualCustomer) {
                if (car instanceof Hatchback) {
                    carsListForCustomerType.add(car);
                }
            } else {
                carsListForCustomerType.add(car);
            }
        }
        return carsListForCustomerType;
    }


    public void createCarRepo() {
        carList = new ArrayList<>();

        SUV suv = new SUV();
        suv.setBrand("Mercedes");
        SUV suv2 = new SUV();
        suv2.setBrand("Fiat");

        Sedan sedan = new Sedan();
        sedan.setBrand("Skoda");
        Sedan sedan2 = new Sedan();
        sedan2.setBrand("Renault");

        Hatchback hatchback = new Hatchback();
        hatchback.setBrand("Volkswagen");
        Hatchback hatchback2 = new Hatchback();
        hatchback2.setBrand("Toyota");

        carList.add(suv);
        carList.add(suv2);
        carList.add(sedan);
        carList.add(sedan2);
        carList.add(hatchback);
        carList.add(hatchback2);
    }

}