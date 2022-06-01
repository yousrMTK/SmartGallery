package com.gallery.smart.SmartGallery.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/** @pdOid 97530ea5-455e-4a33-be6e-8da0fd41cea5 */
@Getter
@Setter
public class Oeuvre {
   /** @pdOid 48924fa3-c4de-4069-940e-92b34a706e0f */
   private int idOeuvre;
   /** @pdOid c20a1dd1-14bb-4a2a-b54c-c9671e9cf018 */
   private String libelleOeuvre;
   /** @pdOid 6134c14c-4d69-4ea5-b1de-7a0aa1278a8b */
   private float prixOeuvre;
   /** @pdOid 0abede8a-a959-4760-8a9b-feef4c6831d5 */
   private int qteStockOeuvre;
   /** @pdOid 46cbb383-81ed-48a4-8438-a5bcd4fba0be */
   private String imgOeuvre;
   /** @pdOid fda15482-b323-4a5b-82fa-e99e4215261d */
   private String descriptionOeuvre;
   /** @pdOid 7b893118-33eb-4718-8871-2fc69e8856cf */
   private Date dateRealisation;
   /** @pdOid 8ecfc95d-339a-4f75-b90a-d464d9918007 */
   private int tautTva;
   /** @pdOid a513d52e-f231-4fbd-9390-473197172888 */
   private int tautRemise;

}