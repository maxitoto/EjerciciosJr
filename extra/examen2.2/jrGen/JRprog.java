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
	public Cap_ext_ op_autos_intTovoid;
	public Cap_ext_ JRget_op_autos_intTovoid() {
		return op_autos_intTovoid;
	}
	public void JRset_op_autos_intTovoid(Cap_ext_ op_autos_intTovoid) {
		this.op_autos_intTovoid = op_autos_intTovoid;
	}

	public Cap_ext_ op_barcos_intTovoid;
	public Cap_ext_ JRget_op_barcos_intTovoid() {
		return op_barcos_intTovoid;
	}
	public void JRset_op_barcos_intTovoid(Cap_ext_ op_barcos_intTovoid) {
		this.op_barcos_intTovoid = op_barcos_intTovoid;
	}

	public Cap_ext_ op_autosesperando_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_autosesperando_javadotlangdotStringTovoid() {
		return op_autosesperando_javadotlangdotStringTovoid;
	}
	public void JRset_op_autosesperando_javadotlangdotStringTovoid(Cap_ext_ op_autosesperando_javadotlangdotStringTovoid) {
		this.op_autosesperando_javadotlangdotStringTovoid = op_autosesperando_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_capacidadMaxima_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_capacidadMaxima_javadotlangdotStringTovoid() {
		return op_capacidadMaxima_javadotlangdotStringTovoid;
	}
	public void JRset_op_capacidadMaxima_javadotlangdotStringTovoid(Cap_ext_ op_capacidadMaxima_javadotlangdotStringTovoid) {
		this.op_capacidadMaxima_javadotlangdotStringTovoid = op_capacidadMaxima_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_rampa_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_rampa_javadotlangdotStringTovoid() {
		return op_rampa_javadotlangdotStringTovoid;
	}
	public void JRset_op_rampa_javadotlangdotStringTovoid(Cap_ext_ op_rampa_javadotlangdotStringTovoid) {
		this.op_rampa_javadotlangdotStringTovoid = op_rampa_javadotlangdotStringTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_autos_intTovoid = copy.op_autos_intTovoid;
	this.op_barcos_intTovoid = copy.op_barcos_intTovoid;
	this.op_autosesperando_javadotlangdotStringTovoid = copy.op_autosesperando_javadotlangdotStringTovoid;
	this.op_capacidadMaxima_javadotlangdotStringTovoid = copy.op_capacidadMaxima_javadotlangdotStringTovoid;
	this.op_rampa_javadotlangdotStringTovoid = copy.op_rampa_javadotlangdotStringTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_autos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_barcos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_autosesperando_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_capacidadMaxima_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_rampa_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_autos_intTovoid = Cap_ext_.noop;
	this.op_barcos_intTovoid = Cap_ext_.noop;
	this.op_autosesperando_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_capacidadMaxima_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_rampa_javadotlangdotStringTovoid = Cap_ext_.noop;

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
