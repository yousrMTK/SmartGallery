package com.gallery.smart.SmartGallery.Model;

import lombok.Getter;
import lombok.Setter;

/** @pdOid 97e5d37e-0397-4f8b-a3f4-7714acba57e1 */
@Getter
@Setter
public class Transaction {
   /** @pdOid 33c5283b-38fa-46c7-bc78-84c03ac62a04 */
   private int idTransaction;
   /** @pdOid aef6dcd1-2218-47f7-b645-80122c290422 */
   private int quantite;
   
   public Oeuvre oeuvre;
}