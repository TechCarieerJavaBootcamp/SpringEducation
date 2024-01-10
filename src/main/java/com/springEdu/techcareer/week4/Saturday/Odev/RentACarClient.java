package com.springEdu.techcareer.week4.Saturday.Odev;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RentACarClient {

    public static final String CORPORATE_CUSTOMER = "CorporateCustomer";
    public static final String INDIVIDUAL_CUSTOMER = "IndividualCustomer";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Müşteri tipi giriniz: ");
            String customerType = scanner.next();
            if (Objects.equals(CORPORATE_CUSTOMER, customerType)) {
                RentACarService rentACarService = new RentACarService(new CorporateCustomer());
                showCarBrand(rentACarService);
            } else if (Objects.equals(INDIVIDUAL_CUSTOMER, customerType)) {
                RentACarService rentACarService = new RentACarService(new IndividualCustomer());
                showCarBrand(rentACarService);
            }

        }
    }

    private static void showCarBrand(RentACarService rentACarService) {
        List<Car> carList = rentACarService.getCarList();
        for (Car car : carList) {
            System.out.println("Aracın markassı: " + car.getBrand());
        }
    }
}
