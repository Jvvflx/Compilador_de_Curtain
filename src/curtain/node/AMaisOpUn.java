/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class AMaisOpUn extends POpUn
{
    private TMais _mais_;

    public AMaisOpUn()
    {
        // Constructor
    }

    public AMaisOpUn(
        @SuppressWarnings("hiding") TMais _mais_)
    {
        // Constructor
        setMais(_mais_);

    }

    @Override
    public Object clone()
    {
        return new AMaisOpUn(
            cloneNode(this._mais_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaisOpUn(this);
    }

    public TMais getMais()
    {
        return this._mais_;
    }

    public void setMais(TMais node)
    {
        if(this._mais_ != null)
        {
            this._mais_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mais_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mais_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mais_ == child)
        {
            this._mais_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mais_ == oldChild)
        {
            setMais((TMais) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
