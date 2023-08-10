plugins {
  id("org.jetbrains.kotlin.jvm").version("1.9.0").apply(false)
  id("test-report-aggregation")
}

dependencies {
  testReportAggregation(project(":kmp-lib"))
  testReportAggregation(project(":jvm-lib"))
}

reporting {
  reports {
    val testAggregateTestReport by creating(AggregateTestReport::class) {
      testType.set(TestSuiteType.UNIT_TEST)
    }
  }
}
