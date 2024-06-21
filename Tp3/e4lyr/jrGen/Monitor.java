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
    private int fichero = 0;
    private int cantLectoresEsperando = 0;
    private int cantLectoresLeyendo = 0;
    private int cantEscritoresEsperando = 0;
    private int cantEscritoresEscribiendo = 0;
    private m_condvar esperandoLeer = new m_condvar("esperandoLeer");
    private m_condvar esperandoEscribir = new m_condvar("esperandoEscribir");
    
    public void escribir(int id) {
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
        JRLoop4: while (cantEscritoresEscribiendo == 1 | cantLectoresLeyendo > 0) {
            // Begin Expr2
            cantEscritoresEsperando++;
            {
                m_condvar m_cv = (esperandoEscribir);
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
            cantEscritoresEsperando--;
        }
        // Begin Expr2
        cantEscritoresEscribiendo++;
        // Begin Expr2
        fichero = ((int)(Math.random() * 50));
        // Begin Expr2
        System.out.println(" Escritor " + id + " esta por escribir y dice{" + " lect leyendo: " + cantLectoresLeyendo + " lect esperando: " + cantLectoresEsperando + " escr escribiendo: " + cantEscritoresEscribiendo + " escr esperando: " + cantEscritoresEsperando + "}");
        // Begin Expr2
        cantEscritoresEscribiendo--;
        if (cantLectoresEsperando > 0 & cantEscritoresEscribiendo == 0) {
            JRLoop5: for (int j = 0; j < cantLectoresEsperando; j++) {
                // Begin Expr2
                (new Cap_ext_((esperandoLeer).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        } else {
            if (cantEscritoresEsperando > 0 & cantLectoresLeyendo == 0) {
                // Begin Expr2
                (new Cap_ext_((esperandoEscribir).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        // Begin Expr2
        System.out.println("escritor" + id + " dejo de escribir");
        // Begin Expr2
        m_next();
    }
    
    public int leer(int id) {
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
        System.out.println("leer " + id + " entro");
        JRLoop6: while (cantEscritoresEscribiendo == 1) {
            // Begin Expr2
            cantLectoresEsperando++;
            {
                m_condvar m_cv = (esperandoLeer);
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
            cantLectoresEsperando--;
        }
        // Begin Expr2
        cantLectoresLeyendo++;
        // Begin Expr2
        System.out.println(" lector " + id + " esta por leer y dice{" + " lect leyendo: " + cantLectoresLeyendo + " lect esperando: " + cantLectoresEsperando + " escr escribiendo: " + cantEscritoresEscribiendo + " escr esperando: " + cantEscritoresEsperando + "}");
        {
            if (true) {
                // Begin Expr2
                m_next();
                // Return
                return (fichero);
                // End Return

            }
        }
        // Begin Expr2
        m_next();
        throw new RuntimeException("reached end of non-void _proc (Monitor.m, line 67) without executing a return");
    }
    
    public void pararDeLeer(int id) {
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
        cantLectoresLeyendo--;
        // Begin Expr2
        System.out.println(" lector " + id + " dejo de leer y dice{" + " lect leyendo: " + cantLectoresLeyendo + " lect esperando: " + cantLectoresEsperando + " escr escribiendo: " + cantEscritoresEscribiendo + " escr esperando: " + cantEscritoresEsperando + "}");
        if (cantEscritoresEsperando > 0 & cantLectoresLeyendo == 0 & cantEscritoresEscribiendo == 0) {
            // Begin Expr2
            (new Cap_ext_((esperandoEscribir).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        } else {
            if (cantLectoresEsperando > 0 & cantEscritoresEscribiendo == 0) {
                JRLoop7: for (int j = 0; j < cantLectoresEsperando; j++) {
                    // Begin Expr2
                    (new Cap_ext_((esperandoLeer).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
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
