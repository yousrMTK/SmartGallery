package com.gallery.smart.SmartGallery.Model;

/** @pdOid b54b0e70-4a3f-4d7a-a8c4-4cae55168dd4 */
public class Client {
   /** @pdOid 4e9291d1-21d0-4db1-800b-5a7f59b6ac21 */
   private int idClient;
   /** @pdOid d7a2dd4d-8500-4d1b-a5da-88011726b728 */
   private String nomClient;
   /** @pdOid f27cc83e-122c-48f4-b3f6-ad3b9b5708da */
   private String adressClient;
   /** @pdOid 1cced450-865b-4926-b45c-cf12d2f00308 */
   private String prenomClient;
   /** @pdOid ce2039c1-340d-406c-bfc9-f8155c18b84e */
   private String telClient;
   /** @pdOid ac6eb9bf-49b2-4ffc-8261-76d71a938e83 */
   private String mailClient;
   /** @pdOid 6769def8-33db-4aa1-b267-ee8c458722ff */
   private String loginClient;
   /** @pdOid f8de9dc2-160d-4338-982f-5b6f3fbbc0a9 */
   private String passClient;
   /** @pdOid 9678f5bc-9f84-4f76-9d2a-254297f113b2 */
   private String codePostalClient;
   
   /** @pdRoleInfo migr=no name=Commande assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Commande> commande;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Commande> getCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommande */
   public void setCommande(java.util.Collection<Commande> newCommande) {
      removeAllCommande();
      for (java.util.Iterator iter = newCommande.iterator(); iter.hasNext();)
         addCommande((Commande)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommande */
   public void addCommande(Commande newCommande) {
      if (newCommande == null)
         return;
      if (this.commande == null)
         this.commande = new java.util.HashSet<Commande>();
      if (!this.commande.contains(newCommande))
         this.commande.add(newCommande);
   }
   
   /** @pdGenerated default remove
     * @param oldCommande */
   public void removeCommande(Commande oldCommande) {
      if (oldCommande == null)
         return;
      if (this.commande != null)
         if (this.commande.contains(oldCommande))
            this.commande.remove(oldCommande);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommande() {
      if (commande != null)
         commande.clear();
   }

}