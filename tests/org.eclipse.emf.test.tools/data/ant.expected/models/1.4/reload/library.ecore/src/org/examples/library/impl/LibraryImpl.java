/**
 * This is my code.
 */
package org.examples.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.examples.hr.HRPackage;
import org.examples.hr.Person;
import org.examples.library.Book;
import org.examples.library.Library;
import org.examples.library.LibraryPackage;
import org.examples.library.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.examples.library.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.examples.library.impl.LibraryImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.examples.library.impl.LibraryImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link org.examples.library.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link org.examples.library.impl.LibraryImpl#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSite() <em>Site</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected static final String SITE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected String site = SITE_EDEFAULT;

  /**
   * The cached value of the '{@link #getWriters() <em>Writers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriters()
   * @generated
   * @ordered
   */
  protected EList writers;

  /**
   * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooks()
   * @generated
   * @ordered
   */
  protected EList books;

  /**
   * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployees()
   * @generated
   * @ordered
   */
  protected EList employees;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LibraryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return LibraryPackage.Literals.LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSite()
  {
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSite(String newSite)
  {
    String oldSite = site;
    site = newSite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__SITE, oldSite, site));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getWriters()
  {
    if (writers == null)
    {
      writers = new EObjectContainmentEList(Writer.class, this, LibraryPackage.LIBRARY__WRITERS);
    }
    return writers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getBooks()
  {
    if (books == null)
    {
      books = new EObjectContainmentEList(Book.class, this, LibraryPackage.LIBRARY__BOOKS);
    }
    return books;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getEmployees()
  {
    if (employees == null)
    {
      employees = new EObjectWithInverseResolvingEList.ManyInverse(Person.class, this, LibraryPackage.LIBRARY__EMPLOYEES, HRPackage.PERSON__LIBRARY);
    }
    return employees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__EMPLOYEES:
        return ((InternalEList)getEmployees()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__WRITERS:
        return ((InternalEList)getWriters()).basicRemove(otherEnd, msgs);
      case LibraryPackage.LIBRARY__BOOKS:
        return ((InternalEList)getBooks()).basicRemove(otherEnd, msgs);
      case LibraryPackage.LIBRARY__EMPLOYEES:
        return ((InternalEList)getEmployees()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__NAME:
        return getName();
      case LibraryPackage.LIBRARY__SITE:
        return getSite();
      case LibraryPackage.LIBRARY__WRITERS:
        return getWriters();
      case LibraryPackage.LIBRARY__BOOKS:
        return getBooks();
      case LibraryPackage.LIBRARY__EMPLOYEES:
        return getEmployees();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__NAME:
        setName((String)newValue);
        return;
      case LibraryPackage.LIBRARY__SITE:
        setSite((String)newValue);
        return;
      case LibraryPackage.LIBRARY__WRITERS:
        getWriters().clear();
        getWriters().addAll((Collection)newValue);
        return;
      case LibraryPackage.LIBRARY__BOOKS:
        getBooks().clear();
        getBooks().addAll((Collection)newValue);
        return;
      case LibraryPackage.LIBRARY__EMPLOYEES:
        getEmployees().clear();
        getEmployees().addAll((Collection)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LibraryPackage.LIBRARY__SITE:
        setSite(SITE_EDEFAULT);
        return;
      case LibraryPackage.LIBRARY__WRITERS:
        getWriters().clear();
        return;
      case LibraryPackage.LIBRARY__BOOKS:
        getBooks().clear();
        return;
      case LibraryPackage.LIBRARY__EMPLOYEES:
        getEmployees().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LibraryPackage.LIBRARY__SITE:
        return SITE_EDEFAULT == null ? site != null : !SITE_EDEFAULT.equals(site);
      case LibraryPackage.LIBRARY__WRITERS:
        return writers != null && !writers.isEmpty();
      case LibraryPackage.LIBRARY__BOOKS:
        return books != null && !books.isEmpty();
      case LibraryPackage.LIBRARY__EMPLOYEES:
        return employees != null && !employees.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", site: "); //$NON-NLS-1$
    result.append(site);
    result.append(')');
    return result.toString();
  }

} //LibraryImpl
