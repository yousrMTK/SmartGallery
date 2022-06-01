package com.gallery.smart.SmartGallery.Model;

import lombok.Getter;
import lombok.Setter;


/** @pdOid 82f13287-8565-4af2-ba8f-aa485083668f */
@Getter
@Setter
public class Materiaux {
   /** @pdOid a4606620-03bd-40db-a6d4-60d96d2d16d5 */
   private int idMateriaux;
   /** @pdOid 6e4fb9b3-3fdf-41d2-9213-c04ca39a7ff1 */
   private String libelleMateriaux;
   
   /** @pdRoleInfo migr=no name=Type assc=association9 mult=1..1 */
   public Type type;

}