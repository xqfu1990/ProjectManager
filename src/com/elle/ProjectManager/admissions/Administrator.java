
package com.elle.ProjectManager.admissions;

import com.elle.ProjectManager.presentation.*;

/**
 * Administrator
 * The administrator access level configuration
 * @author Carlos Igreja
 * @since  Mar 1, 2016
 */
public class Administrator implements IAdminComponent{

    @Override
    public void setComponent(BackupDBTablesDialog window) {
    }

    @Override
    public void setComponent(BatchEditWindow window) {
    }

    @Override
    public void setComponent(CompIssuesListWindow window) {
    }

    @Override
    public void setComponent(EditDatabaseWindow window) {
    }

    @Override
    public void setComponent(LogWindow window) {
    }

    @Override
    public void setComponent(LoginWindow window) {
    }

    @Override
    public void setComponent(ProjectManagerWindow window) {
        window.getMenuReports().setEnabled(false);
    }
}
