/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import java.util.*;
import curtain.analysis.*;

@SuppressWarnings("nls")
public final class AIgnoredAlt extends PAlt
{
    private TParEsq _parEsq_;
    private PAltName _altName_;
    private final LinkedList<PElem> _elems_ = new LinkedList<PElem>();
    private TParDir _parDir_;

    public AIgnoredAlt()
    {
        // Constructor
    }

    public AIgnoredAlt(
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PAltName _altName_,
        @SuppressWarnings("hiding") List<?> _elems_,
        @SuppressWarnings("hiding") TParDir _parDir_)
    {
        // Constructor
        setParEsq(_parEsq_);

        setAltName(_altName_);

        setElems(_elems_);

        setParDir(_parDir_);

    }

    @Override
    public Object clone()
    {
        return new AIgnoredAlt(
            cloneNode(this._parEsq_),
            cloneNode(this._altName_),
            cloneList(this._elems_),
            cloneNode(this._parDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgnoredAlt(this);
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PAltName getAltName()
    {
        return this._altName_;
    }

    public void setAltName(PAltName node)
    {
        if(this._altName_ != null)
        {
            this._altName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._altName_ = node;
    }

    public LinkedList<PElem> getElems()
    {
        return this._elems_;
    }

    public void setElems(List<?> list)
    {
        for(PElem e : this._elems_)
        {
            e.parent(null);
        }
        this._elems_.clear();

        for(Object obj_e : list)
        {
            PElem e = (PElem) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._elems_.add(e);
        }
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parEsq_)
            + toString(this._altName_)
            + toString(this._elems_)
            + toString(this._parDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._altName_ == child)
        {
            this._altName_ = null;
            return;
        }

        if(this._elems_.remove(child))
        {
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._altName_ == oldChild)
        {
            setAltName((PAltName) newChild);
            return;
        }

        for(ListIterator<PElem> i = this._elems_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElem) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
