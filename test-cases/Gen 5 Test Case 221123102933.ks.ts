import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.verifyElementVisible({
    type: "Web",
    id: "e455f079-d35c-4fa7-9f9b-50b947b852c8",
    attributes: {},
    childIndex: 1,
    hashes: { "md5.v1": "4e2cd1725b0952f43013ef92c8b0a696" },
    name: "h1 - CURA Healthcare Service",
    selectors: [
      {
        id: "d762bd8d-8440-4639-84ac-1eede3ae1871",
        type: "CSS",
        value: "h1",
        isDefault: true,
      },
      {
        id: "a75d612d-3735-4249-972d-b965dfb0c090",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "h1",
    text: "CURA Healthcare Service",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.verifyElementVisible({
    type: "Web",
    id: "cc179349-4c83-4206-8cc8-23544c7f913e",
    attributes: {
      id: "btn-make-appointment",
      href: "./profile.php#login",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
    name: "a - Make Appointment",
    selectors: [
      {
        id: "bf210ce5-727a-410c-9ee1-853747fff3a6",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "736f7118-5cbb-417c-82fb-6b6d21bf24b8",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
});