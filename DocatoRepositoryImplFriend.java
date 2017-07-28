package com.docato.repository.impl;

import com.xhive.dom.interfaces.XhiveLibraryChildIf;


/**
 * Hack: By having this code in the com.docato.repository.impl package,
 *       we can get access to protected methods.
 */
public class DocatoRepositoryImplFriend {

  private DocatoRepositoryImplFriend() { }
  
  
  public static XhiveLibraryChildIf getLibraryChild(XhiveVersionableResource resource) {
    return resource.getLibraryChild();
  }
  
  public static XhiveLibraryChildIf getWorkspaceRepresentation(XhiveVersionableResource resource) {
    return resource.getWorkSpaceRepresentation(null);
  }
  
public static void getLibraryChild() {
    //doNothing
  }
  

  
}
