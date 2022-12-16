package uitest.atm_department_page;

import org.testng.annotations.Test;
import page.atm_dapartment_page.AtmDepartmentPage;
import uitest.core_uitest.BaseUiTest;

public class AtmDepartmentPageUiTest extends BaseUiTest {
    @Test(testName = "testPositiveFilters",
            groups = {"Smoke"},
            description = "Тест позитивный фильтров")
    public void testPositiveFilters() {
        new AtmDepartmentPage(driver)
                .pressAtmsAndDepartmentsButton()
                .pressCookiesButton()
                .pressYourRegionYesButton()
                .pressCollapseFiltersFrameButton()
                .pressExpandFiltersFrameButton()
                .pressPayFilter()
                .pressAroundTheClockFilter()
                .pressObjectOnMapFilter();
    }

    @Test(testName = "testPositiveFindCityByAddressField",
            groups = {"Smoke"},
            description = "Тест позитивный поля Поиск по адресу")
    public void testPositiveFindCityByAddressField() {
        new AtmDepartmentPage(driver)
                .pressAtmsAndDepartmentsButton()
                .pressCookiesButton()
                .pressYourRegionYesButton()
                .pressCollapseFiltersFrameButton()
                .pressExpandFiltersFrameButton()
                .fillFindByAddressField("Москва")
                .pressFirstElementLocationButton()
                .getFindByAddressFieldErrorMessage();
    }
}
