/**********************************************************************
 *
 * Copyright (c) by Olaf Willuhn
 * All rights reserved
 * GPLv2
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.synchronize.jobs;



/**
 * Standard-Job-Implementierung zum Abrufen der elektronischen Kontoauszugs im PDF-Format.
 */
public class SynchronizeJobKontoauszugPdf extends AbstractSynchronizeJob
{
  /**
   * Context-Key fuer das forcierte Abrufen der Kontoauszuege. Auch dann, wenn es
   * in den Synchronisierungsoptionen deaktiviert ist. Der Wert des Keys
   * muss vom Typ {@link Boolean} sein.
   */
  public final static String CTX_FORCE = "ctx.konto.kontoauszugpdf.force";

  /**
   * @see de.willuhn.jameica.hbci.synchronize.jobs.SynchronizeJob#isRecurring()
   */
  public boolean isRecurring()
  {
    return true;
  }
}

