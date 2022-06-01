package com.gallery.smart.SmartGallery.Model;
import lombok.Getter;
import lombok.Setter;

/** @pdOid ac8b129e-87b2-4074-b85f-5ace089f8fbf */
@Getter
@Setter
public class Type {
   /** @pdOid bba376df-52db-46c3-9923-8a1c322dad67 */
   private int idType;
   /** @pdOid 2d792a7f-59ca-4536-81e3-0f4d4f2c22fa */
   private String libelleType;
   
   /** @pdRoleInfo migr=no name=Oeuvre assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Oeuvre> oeuvre;
   /** @pdRoleInfo migr=no name=Style assc=association7 mult=1..1 */
   public Style style;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Oeuvre> getOeuvre() {
      if (oeuvre == null)
         oeuvre = new java.util.HashSet<Oeuvre>();
      return oeuvre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOeuvre() {
      if (oeuvre == null)
         oeuvre = new java.util.HashSet<Oeuvre>();
      return oeuvre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOeuvre */
   public void setOeuvre(java.util.Collection<Oeuvre> newOeuvre) {
      removeAllOeuvre();
      for (java.util.Iterator iter = newOeuvre.iterator(); iter.hasNext();)
         addOeuvre((Oeuvre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOeuvre */
   public void addOeuvre(Oeuvre newOeuvre) {
      if (newOeuvre == null)
         return;
      if (this.oeuvre == null)
         this.oeuvre = new java.util.HashSet<Oeuvre>();
      if (!this.oeuvre.contains(newOeuvre))
         this.oeuvre.add(newOeuvre);
   }
   
   /** @pdGenerated default remove
     * @param oldOeuvre */
   public void removeOeuvre(Oeuvre oldOeuvre) {
      if (oldOeuvre == null)
         return;
      if (this.oeuvre != null)
         if (this.oeuvre.contains(oldOeuvre))
            this.oeuvre.remove(oldOeuvre);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOeuvre() {
      if (oeuvre != null)
         oeuvre.clear();
   }

}