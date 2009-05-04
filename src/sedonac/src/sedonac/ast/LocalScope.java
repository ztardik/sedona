//
// Copyright (c) 2007 Tridium, Inc.
// Licensed under the Academic Free License version 3.0
//
// History:
//   12 Feb 07  Brian Frank  Creation
//

package sedonac.ast;

import java.io.*;
import sedonac.namespace.*;

/**
 * VarDef is a common interface between ParamDef and Stmt.LocalDef.
 */
public interface LocalScope
{

  public Stmt.LocalDef[] getLocals();
  public Stmt.LocalDef resolveLocal(String name);

}
