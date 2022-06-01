package com.gallery.smart.SmartGallery.Model;
import java.util.*;

/** @pdOid 657c14fc-9722-4abe-8489-aeba6d39dd56 */
public class Livraison {
   /** @pdOid f319c7cb-f20d-4f12-886f-b28877bb77b1 */
   private int idLivraison;
   /** @pdOid ab5ae3ff-72c7-4ea4-8d4b-fa6d2018209f */
   private Date dateLivraison;
   /** @pdOid 02d2a1c3-5868-4169-9826-4f83827c1b6a */
   private String descriptionDeLivraison;
   
   /** @pdRoleInfo migr=no name=Commande assc=association4 mult=1..1 */
   public Commande commande;

}