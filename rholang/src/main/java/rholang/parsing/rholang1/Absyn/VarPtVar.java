package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class VarPtVar extends VarPattern {
  public final String var_;
  public VarPtVar(String p1) { var_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.VarPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.VarPtVar) {
      rholang.parsing.rholang1.Absyn.VarPtVar x = (rholang.parsing.rholang1.Absyn.VarPtVar)o;
      return this.var_.equals(x.var_);
    }
    return false;
  }

  public int hashCode() {
    return this.var_.hashCode();
  }


}
