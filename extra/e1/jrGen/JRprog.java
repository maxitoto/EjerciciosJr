/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRprog
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_deSurANorte_intTovoid;
	public Cap_ext_ JRget_op_deSurANorte_intTovoid() {
		return op_deSurANorte_intTovoid;
	}
	public void JRset_op_deSurANorte_intTovoid(Cap_ext_ op_deSurANorte_intTovoid) {
		this.op_deSurANorte_intTovoid = op_deSurANorte_intTovoid;
	}

	public Cap_ext_ op_deNorteASur_intTovoid;
	public Cap_ext_ JRget_op_deNorteASur_intTovoid() {
		return op_deNorteASur_intTovoid;
	}
	public void JRset_op_deNorteASur_intTovoid(Cap_ext_ op_deNorteASur_intTovoid) {
		this.op_deNorteASur_intTovoid = op_deNorteASur_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_deSurANorte_intTovoid = copy.op_deSurANorte_intTovoid;
	this.op_deNorteASur_intTovoid = copy.op_deNorteASur_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_deSurANorte_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_deNorteASur_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_deSurANorte_intTovoid = Cap_ext_.noop;
	this.op_deNorteASur_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRprog(true);
	}
    }
