package by.pvt.hashmap;

import java.util.*;

public class Tax {
   private Map<String, List<Firm>> collectionTax = new HashMap<>();

   public void addMap(String key, List<Firm> list) {
      collectionTax.put(key, list);
   }

   @Override
   public String toString() {
      return "Tax{" +
              "collectionTax=" + collectionTax +
              '}';
   }

   public Map<String, List<Firm>> getCollectionTax() {
      return collectionTax;
   }

   public void setCollectionTax(Map<String, List<Firm>> collectionTax) {
      this.collectionTax = collectionTax;
   }

   //Создать метод, который после оплаты налога какой-нибудь фирмой проверял задолжность и перед налоговой, и мог переместить эту фирму в другой статус (в соответствующий ключ).
   public List<Firm> check1(List<Firm> firmList) {
      List<Firm> newList = new ArrayList<>();
      for (Firm firm : firmList) {
         if (firm.getDebt() == 0) {
            newList.add(firm);
         }
      }
      return newList;
   }

   public List<Firm> check2(List<Firm> firmList) {
      List<Firm> newList = new ArrayList<>();
      for (Firm firm : firmList) {
         if (firm.getDebt() > 0 && firm.getDebt() < 10000) {
            newList.add(firm);
         }
      }
      return newList;
   }

   public List<Firm> check3(List<Firm> firmList) {
      List<Firm> newList = new ArrayList<>();
      for (Firm firm : firmList) {
         if (firm.getDebt() > 10000) {
            newList.add(firm);
         }
      }
      return newList;
   }
}


