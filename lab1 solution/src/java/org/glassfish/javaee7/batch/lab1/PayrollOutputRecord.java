/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.glassfish.javaee7.batch.lab1;

public class PayrollOutputRecord {
    private final int empId;

    private float salary;
    
    private float socialSecurityTax;
    
    private float bonus = 0;
    
    private float net;
    
    public PayrollOutputRecord(int empID) {
        this.empId = empID;
    }

    public int getEmpId() {
        return empId;
    }
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float base) {
        this.salary = base;
    }

    public float getSocialSecurityTax() {
        return socialSecurityTax;
    }

    public void setSocialSecurityTax(float socialSecurityTax) {
        this.socialSecurityTax = socialSecurityTax;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getNet() {
        return net;
    }

    public void setNet(float net) {
        this.net = net;
    }
    
    @Override
    public int hashCode() {
        return getEmpId();
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (object == null || !(object instanceof PayrollOutputRecord)) {
            return false;
        }
        PayrollOutputRecord other = (PayrollOutputRecord) object;
        return getEmpId() == other.getEmpId();
    }

    @Override
    public String toString() {
        return "PayrollOutputRecord[ id= [" + getEmpId() + "]";
    }
    
}
