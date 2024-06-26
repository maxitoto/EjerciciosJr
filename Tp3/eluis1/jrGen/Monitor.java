/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class Monitor extends java.lang.Object {
    { JRinit(); }
    Op_ext.JRProxyOp JRget_op_m_mutex_voidTovoid()
    {
        return op_m_mutex_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_mutex_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_m_urgentq_voidTovoid()
    {
        return op_m_urgentq_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_urgentq_voidTovoid;
    
    int m_n_urgentq = 0;
    String m_name;
    
    public Monitor(String n) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.m_name = n;
        JRprocess();
    }
    
    private void m_next() {
        if (m_n_urgentq > 0) {
            // Begin Expr2
            m_n_urgentq--;
            op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        } else {
            op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        }
    }
    private m_condvar terminenLaPrimerRueda = new m_condvar("terminenLaPrimerRueda");
    private m_condvar terminenLasRuedas = new m_condvar("terminenLasRuedas");
    private m_condvar terminenUnaRueda = new m_condvar("terminenUnaRueda");
    private m_condvar terminenOtraRueda = new m_condvar("terminenOtraRueda");
    private m_condvar terminenElManillar = new m_condvar("terminenElManillar");
    private m_condvar termineneElCuadro = new m_condvar("termineneElCuadro");
    private m_condvar pidanUnCuadro = new m_condvar("pidanUnCuadro");
    
    public void ensamblarBicicleta() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        System.out.println("El montador solcita las partes de una bicicleta");
        // Begin Expr2
        (new Cap_ext_((pidanUnCuadro).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        // Begin Expr2
        System.out.println("El montador espera a que terminen de fabricar los componentes");
        {
            m_condvar m_cv = (terminenLasRuedas);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("El montador arma una bicileta");
        // Begin Expr2
        m_next();
    }
    
    public void montarCuadro() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        {
            m_condvar m_cv = (pidanUnCuadro);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("El Op1 termino el cuadro");
        // Begin Expr2
        (new Cap_ext_((termineneElCuadro).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        // Begin Expr2
        m_next();
    }
    
    public void montarManillar() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        {
            m_condvar m_cv = (termineneElCuadro);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("El Op2 termino el manillar");
        // Begin Expr2
        (new Cap_ext_((terminenUnaRueda).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        {
            m_condvar m_cv = (terminenLaPrimerRueda);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        (new Cap_ext_((terminenOtraRueda).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        // Begin Expr2
        m_next();
    }
    
    public void montarRuedas() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        {
            m_condvar m_cv = (terminenUnaRueda);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("El Op3 termino una rueda");
        // Begin Expr2
        (new Cap_ext_((terminenLaPrimerRueda).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        {
            m_condvar m_cv = (terminenOtraRueda);
            m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
            m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
            // Begin Expr2
            m_next();
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("El Op3 termino otra rueda");
        // Begin Expr2
        (new Cap_ext_((terminenLasRuedas).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        // Begin Expr2
        m_next();
    }
    protected boolean JRcalled = false;
    protected JRMonitor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_m_urgentq_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_m_mutex_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRMonitor(op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
