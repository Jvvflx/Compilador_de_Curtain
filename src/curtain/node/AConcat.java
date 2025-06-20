/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import java.util.*;
import curtain.analysis.*;

@SuppressWarnings("nls")
public final class AConcat extends PConcat
{
    private final LinkedList<PExprUn> _exprUns_ = new LinkedList<PExprUn>();

    public AConcat()
    {
        // Constructor
    }

    public AConcat(
        @SuppressWarnings("hiding") List<?> _exprUns_)
    {
        // Constructor
        setExprUns(_exprUns_);

    }

    @Override
    public Object clone()
    {
        return new AConcat(
            cloneList(this._exprUns_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcat(this);
    }

    public LinkedList<PExprUn> getExprUns()
    {
        return this._exprUns_;
    }

    public void setExprUns(List<?> list)
    {
        for(PExprUn e : this._exprUns_)
        {
            e.parent(null);
        }
        this._exprUns_.clear();

        for(Object obj_e : list)
        {
            PExprUn e = (PExprUn) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exprUns_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprUns_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprUns_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PExprUn> i = this._exprUns_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExprUn) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
