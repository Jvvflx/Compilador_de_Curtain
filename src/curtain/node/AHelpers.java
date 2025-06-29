/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import java.util.*;
import curtain.analysis.*;

@SuppressWarnings("nls")
public final class AHelpers extends PHelpers
{
    private THelpers _helpers_;
    private final LinkedList<PHelperDef> _helperDefs_ = new LinkedList<PHelperDef>();

    public AHelpers()
    {
        // Constructor
    }

    public AHelpers(
        @SuppressWarnings("hiding") THelpers _helpers_,
        @SuppressWarnings("hiding") List<?> _helperDefs_)
    {
        // Constructor
        setHelpers(_helpers_);

        setHelperDefs(_helperDefs_);

    }

    @Override
    public Object clone()
    {
        return new AHelpers(
            cloneNode(this._helpers_),
            cloneList(this._helperDefs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHelpers(this);
    }

    public THelpers getHelpers()
    {
        return this._helpers_;
    }

    public void setHelpers(THelpers node)
    {
        if(this._helpers_ != null)
        {
            this._helpers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._helpers_ = node;
    }

    public LinkedList<PHelperDef> getHelperDefs()
    {
        return this._helperDefs_;
    }

    public void setHelperDefs(List<?> list)
    {
        for(PHelperDef e : this._helperDefs_)
        {
            e.parent(null);
        }
        this._helperDefs_.clear();

        for(Object obj_e : list)
        {
            PHelperDef e = (PHelperDef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._helperDefs_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._helpers_)
            + toString(this._helperDefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._helpers_ == child)
        {
            this._helpers_ = null;
            return;
        }

        if(this._helperDefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._helpers_ == oldChild)
        {
            setHelpers((THelpers) newChild);
            return;
        }

        for(ListIterator<PHelperDef> i = this._helperDefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PHelperDef) newChild);
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
