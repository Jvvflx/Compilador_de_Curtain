/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import java.util.*;
import curtain.analysis.*;

@SuppressWarnings("nls")
public final class APkgName extends PPkgName
{
    private TPkgId _pkgId_;
    private final LinkedList<PPkgNameTail> _pkgIds_ = new LinkedList<PPkgNameTail>();
    private TSemicolon _semicolon_;

    public APkgName()
    {
        // Constructor
    }

    public APkgName(
        @SuppressWarnings("hiding") TPkgId _pkgId_,
        @SuppressWarnings("hiding") List<?> _pkgIds_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setPkgId(_pkgId_);

        setPkgIds(_pkgIds_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new APkgName(
            cloneNode(this._pkgId_),
            cloneList(this._pkgIds_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPkgName(this);
    }

    public TPkgId getPkgId()
    {
        return this._pkgId_;
    }

    public void setPkgId(TPkgId node)
    {
        if(this._pkgId_ != null)
        {
            this._pkgId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pkgId_ = node;
    }

    public LinkedList<PPkgNameTail> getPkgIds()
    {
        return this._pkgIds_;
    }

    public void setPkgIds(List<?> list)
    {
        for(PPkgNameTail e : this._pkgIds_)
        {
            e.parent(null);
        }
        this._pkgIds_.clear();

        for(Object obj_e : list)
        {
            PPkgNameTail e = (PPkgNameTail) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._pkgIds_.add(e);
        }
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pkgId_)
            + toString(this._pkgIds_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pkgId_ == child)
        {
            this._pkgId_ = null;
            return;
        }

        if(this._pkgIds_.remove(child))
        {
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pkgId_ == oldChild)
        {
            setPkgId((TPkgId) newChild);
            return;
        }

        for(ListIterator<PPkgNameTail> i = this._pkgIds_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PPkgNameTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
